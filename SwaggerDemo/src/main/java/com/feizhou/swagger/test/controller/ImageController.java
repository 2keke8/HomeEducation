package com.feizhou.swagger.test.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.jfinal.core.Controller;

public class ImageController extends Controller{
	public void index(){
		String saveImgFilePath = "f://zxing.png";
		Boolean encode = PhotoQrCode.encode("我是Javen205", BarcodeFormat.QR_CODE, 3, ErrorCorrectionLevel.H, "png", 200, 200,
				saveImgFilePath);
		if (encode) {
			Result result = PhotoQrCode.decode(saveImgFilePath);
			String text = result.getText();
			System.out.println(text);
		}
	}
	
}
