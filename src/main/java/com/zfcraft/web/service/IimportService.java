package com.zfcraft.web.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by
 */

public interface IimportService {

    Integer importExcel(MultipartFile myFile);
}
