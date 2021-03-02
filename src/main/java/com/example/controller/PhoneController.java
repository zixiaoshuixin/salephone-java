package com.example.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.PhoneDTO;
import com.example.pojo.Phone;
import com.example.service.PhoneService;
import com.example.service.RepositoryService;
import com.example.service.SupplierService;

import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin
public class PhoneController {
	
	@Autowired
	private PhoneService service;
	
	@Autowired
	private RepositoryService repositoryService;
	
	@Autowired
	private SupplierService supplierService;
	
	
	/**
	 * 查询所有商品
	 */
	@RequestMapping("/selectAllPhones")
	@ResponseBody
	public List<Phone> selectAllPhones(){
		return service.selectAllPhones();
	}
	
	/**
	 * 根据商品标识符查询商品
	 */
	@RequestMapping("/selectPhoneByPhoneID")
	@ResponseBody
	public Phone selectPhoneByPhoneID(@RequestParam String phoneID) {
		if (phoneID.length() > 0 && phoneID.length() <= 20) {
			return service.selectPhoneByPhoneID(phoneID);
		}
		return null;
	}
	
	/**
	 * 根据商品名称查询商品
	 */
	@RequestMapping("/selectPhonesByPhoneName")
	@ResponseBody
	public List<Phone> selectPhonesByPhoneName(@RequestParam String phoneName){
		if (phoneName.length() > 0) {
			return service.selectPhonesByPhoneName(phoneName);
		}
		return null;
	}
	
	/**
	 * 根据商品品牌(类型)查询商品
	 */
	@RequestMapping("/selectPhonesByPhoneBrand")
	@ResponseBody
	public List<Phone> selectPhonesByPhoneBrand(@RequestParam String phoneBrand){
		if (phoneBrand.length() > 0) {
			return service.selectPhonesByPhoneBrand(phoneBrand);
		}
		return null;
	}
	
	/**
	 * 根据商品型号(大小)查询商品
	 */
	@RequestMapping("/selectPhonesByTypeNumber")
	@ResponseBody
	public List<Phone> selectPhonesByTypeNumber(@RequestParam String typeNumber){
		if (typeNumber.length() > 0) {
			return service.selectPhonesByTypeNumber(typeNumber);
		}
		return null;
	}
	
	/**
	 * 根据商品颜色查询商品
	 */
	@RequestMapping("/selectPhoneByPhonesColor")
	@ResponseBody
	public List<Phone> selectPhoneByPhonesColor(@RequestParam String phoneColor){
		if (phoneColor.length() > 0) {
			return service.selectPhoneByPhonesColor(phoneColor);
		}
		return null;
	}
	
	/**
	 * 查询一个供应商的所有商品
	 */
	@RequestMapping("/selectPhonesOfOneSupplier")
	@ResponseBody
	public List<Phone> selectPhonesOfOneSupplier(@RequestParam String supplierID){
		if (supplierID.length() > 0 && supplierID.length() <= 20) {
			return service.selectPhonesOfOneSupplier(supplierID);
		}
		return null;
	}
	
	/**
	 * 根据商品状态(下架/上架/等)查询商品状态
	 */
	@RequestMapping("/selectPhonesByPhoneState")
	@ResponseBody
	public List<Phone> selectPhonesByPhoneState(@RequestParam String phoneState){
		if (phoneState.length() > 0) {
			return service.selectPhonesByPhoneState(phoneState);
		}
		return null;
	}
	
	/**
	 * 新增商品
	 */
	@RequestMapping("/insertPhone")
	@ResponseBody
	public void insertPhone(@RequestBody PhoneDTO phoneDTO) {
		Phone phone = new Phone();
		phone.setPhoneID(phoneDTO.getPhoneID());
		phone.setPhoneBrand(phoneDTO.getPhoneBrand());
		phone.setPhoneColor(phoneDTO.getPhoneColor());
		phone.setPhoneDetails(phoneDTO.getPhoneDetails());
		phone.setPhoneFunction(phoneDTO.getPhoneFunction());
		phone.setPhoneName(phoneDTO.getPhoneName());
		phone.setPhonePicture(phoneDTO.getPhonePicture());
		phone.setPhoneState(phoneDTO.getPhoneState());
		phone.setProductTime(phoneDTO.getProductTime());
		phone.setPurchasingPrice(phoneDTO.getPurchasingPrice());
		phone.setRemains(phoneDTO.getRemains());
		phone.setReposID(phoneDTO.getReposID());
		phone.setRepository(repositoryService.selectRepositoryByRepositoryID(phone.getReposID()));
		phone.setSellingPrice(phoneDTO.getSellingPrice());
		phone.setSupplierID(phoneDTO.getSupplierID());
		phone.setSupplier(supplierService.selectSupplierBySupplierID(phone.getSupplierID()));
		phone.setTypeNumber(phoneDTO.getTypeNumber());
		if (phone != null) {
			service.insertPhone(phone);
		}
		
	}
	
	/**
	 * 
	 * 根据商品标识符删除商品
	 */
	@RequestMapping("/deletePhoneByID")
	@ResponseBody
	public void deletePhoneByID(@RequestParam String phoneID) {
		if (phoneID.length() > 0) {
			service.deletePhoneByID(phoneID);
		}
	}
	
	
	/**
	 * 修改一件商品信息
	 */
	@RequestMapping("/updatePhoneByPhoneID")
	@ResponseBody
	public void updatePhoneByPhoneID(@RequestBody PhoneDTO phoneDTO) {
		Phone phone = new Phone();
		phone.setPhoneID(phoneDTO.getPhoneID());
		phone.setPhoneBrand(phoneDTO.getPhoneBrand());
		phone.setPhoneColor(phoneDTO.getPhoneColor());
		phone.setPhoneDetails(phoneDTO.getPhoneDetails());
		phone.setPhoneFunction(phoneDTO.getPhoneFunction());
		phone.setPhoneName(phoneDTO.getPhoneName());
		phone.setPhonePicture(phoneDTO.getPhonePicture());
		phone.setPhoneState(phoneDTO.getPhoneState());
		phone.setProductTime(phoneDTO.getProductTime());
		phone.setPurchasingPrice(phoneDTO.getPurchasingPrice());
		phone.setRemains(phoneDTO.getRemains());
		phone.setReposID(phoneDTO.getReposID());
		phone.setRepository(repositoryService.selectRepositoryByRepositoryID(phone.getReposID()));
		phone.setSellingPrice(phoneDTO.getSellingPrice());
		phone.setSupplierID(phoneDTO.getSupplierID());
		phone.setSupplier(supplierService.selectSupplierBySupplierID(phone.getSupplierID()));
		phone.setTypeNumber(phoneDTO.getTypeNumber());
		if (phone != null) {
			service.updatePhoneByPhoneID(phone);
		}
	}
	
	/**
	 * 根据商品名称修改商品
	 */
	@RequestMapping("/updatePhonesByPhoneName")
	@ResponseBody
	public void updatePhonesByPhoneName(@RequestBody PhoneDTO phoneDTO) {
		Phone phone = new Phone();
		phone.setPhoneID(phoneDTO.getPhoneID());
		phone.setPhoneBrand(phoneDTO.getPhoneBrand());
		phone.setPhoneColor(phoneDTO.getPhoneColor());
		phone.setPhoneDetails(phoneDTO.getPhoneDetails());
		phone.setPhoneFunction(phoneDTO.getPhoneFunction());
		phone.setPhoneName(phoneDTO.getPhoneName());
		phone.setPhonePicture(phoneDTO.getPhonePicture());
		phone.setPhoneState(phoneDTO.getPhoneState());
		phone.setProductTime(phoneDTO.getProductTime());
		phone.setPurchasingPrice(phoneDTO.getPurchasingPrice());
		phone.setRemains(phoneDTO.getRemains());
		phone.setReposID(phoneDTO.getReposID());
		phone.setRepository(repositoryService.selectRepositoryByRepositoryID(phone.getReposID()));
		phone.setSellingPrice(phoneDTO.getSellingPrice());
		phone.setSupplierID(phoneDTO.getSupplierID());
		phone.setSupplier(supplierService.selectSupplierBySupplierID(phone.getSupplierID()));
		phone.setTypeNumber(phoneDTO.getTypeNumber());
		if (phone != null) {
			service.updatePhonesByPhoneName(phone);
		}
	}
	
	
	/**
	 * 查询一个仓库中的所有商品
	 */
	@RequestMapping("/selectPhonesInRepository")
	@ResponseBody
	public List<Phone> selectPhonesInRepository(@RequestParam String reposID){
		if (reposID.length() > 0 ) {
			return service.selectPhonesInRepository(reposID);
		}
		return null;
	}
	
	
	@RequestMapping("/uploadPhoto")
	@ApiOperation(value = "上传图片", notes = "上传图片")
	public String uploadPhoto(@RequestParam(name = "image_data", required = false) MultipartFile file) throws IOException {
		// 文件上传
		String imageName = file.getOriginalFilename();
		System.out.println("文件名称："+imageName);
		String newCompanyImagePath = "";
		if (!file.isEmpty()) {
			try {
				newCompanyImagePath = "C:\\Users\\sq\\Documents\\workspace-spring-tool-suite-4-4.6.2.RELEASE\\sale\\src\\main\\resources\\static\\img\\phone\\"
						+ imageName;

				File newFile = new File(newCompanyImagePath);
				if (!newFile.exists()) {
					newFile.createNewFile();
				}
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
				out.write(file.getBytes());
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return "图片上传失败！";
			} catch (IOException e) {
				e.printStackTrace();
				return "图片上传失败！";
			}
		}
		String imagePath = "http://localhost:8888/static/img/" + imageName;
		return imagePath;
	}
	
	
}
