package com.zfcraft.web.controller;

import com.zfcraft.web.service.IimportService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class FileController {

    @Value("${file.upload.url}")
    private String uploadFilePath;
    @Autowired
    private IimportService iimportService;


    //  Excel导入数据到数据库
    @PostMapping("/importExcel")
    public String importExcel(@RequestParam("myfile") MultipartFile myFile){
        ModelAndView modelAndView = new ModelAndView();

        Integer nums = iimportService.importExcel(myFile);
        modelAndView.addObject("msg","导入数成功");
        return "导入成功";
    }

    @RequestMapping("/uploadFile")
    @ResponseBody
    public JSONObject httpUpload(@RequestParam("files") MultipartFile files[]) throws IOException {
        JSONObject jsonObject = new JSONObject();

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getOriginalFilename();
            File dest = new File(uploadFilePath + "\\" + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }

            files[i].transferTo(dest);
        }

        jsonObject.put("code", 200);
        jsonObject.put("meg", "上传成功！");
        return jsonObject;
    }

    @RequestMapping("/downloadFile")
    @ResponseBody
    public JSONObject httpDownload(HttpServletResponse httpServletResponse,
                                   @RequestParam("fileName") String fileName) throws IOException {
        JSONObject jsonObject = new JSONObject();
        File file = new File(uploadFilePath + "\\" + fileName + ".xlsx");
        if (!file.exists()) {
            jsonObject.put("code", 500);
            jsonObject.put("meg", "下载失败,文件不存在！");
            return jsonObject;
        }

        //浏览器下载中文名文件兼容性处理
//        String filaname = new String(templateFileName.getBytes("gb2312"),"ISO8859-1");
        // 清空response
        httpServletResponse.reset();
        //octet-stream 自动匹配文件类型
        httpServletResponse.setContentType("application/vnd.ms-excel;charset=ISO8859-1");
        httpServletResponse.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");
//        httpServletResponse.setHeader("Content-Length", String.valueOf(fileLength));

//        InputStream is = new FileInputStream(file);
//        OutputStream os = httpServletResponse.getOutputStream();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        byte[] buff = new byte[1024];
        OutputStream os = httpServletResponse.getOutputStream();
        int i = 0;
        while ((i = bis.read(buff)) != -1) {
            os.write(buff, 0, i);
            os.flush();
        }

        jsonObject.put("code", 200);
        jsonObject.put("meg", "上传成功！");
        return jsonObject;
    }

}


