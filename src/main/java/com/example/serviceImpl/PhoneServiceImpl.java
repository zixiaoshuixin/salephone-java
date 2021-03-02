package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.PhoneMapper;
import com.example.pojo.Phone;
import com.example.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService{

	@Autowired
	private PhoneMapper mapper;

	@Override
	public List<Phone> selectAllPhones() {
		// TODO Auto-generated method stub
		return mapper.selectAllPhones();
	}

	@Override
	public Phone selectPhoneByPhoneID(String phoneID) {
		// TODO Auto-generated method stub
		return mapper.selectPhoneByPhoneID(phoneID);
	}

	@Override
	public List<Phone> selectPhonesByPhoneName(String phoneName) {
		// TODO Auto-generated method stub
		return mapper.selectPhonesByPhoneName(phoneName);
	}

	@Override
	public List<Phone> selectPhonesByPhoneBrand(String phoneBrand) {
		// TODO Auto-generated method stub
		return mapper.selectPhonesByPhoneBrand(phoneBrand);
	}

	@Override
	public List<Phone> selectPhonesByTypeNumber(String typeNumber) {
		// TODO Auto-generated method stub
		return mapper.selectPhonesByTypeNumber(typeNumber);
	}

	@Override
	public List<Phone> selectPhoneByPhonesColor(String phoneColor) {
		// TODO Auto-generated method stub
		return mapper.selectPhoneByPhonesColor(phoneColor);
	}

	@Override
	public List<Phone> selectPhonesOfOneSupplier(String supplierID) {
		// TODO Auto-generated method stub
		return mapper.selectPhonesOfOneSupplier(supplierID);
	}

	@Override
	public List<Phone> selectPhonesByPhoneState(String phoneState) {
		// TODO Auto-generated method stub
		return mapper.selectPhonesByPhoneState(phoneState);
	}

	@Override
	public int insertPhone(Phone phone) {
		// TODO Auto-generated method stub
		return mapper.insertPhone(phone);
	}

	@Override
	public int deletePhoneByID(String phoneID) {
		// TODO Auto-generated method stub
		return mapper.deletePhoneByID(phoneID);
	}

	@Override
	public int updatePhoneByPhoneID(Phone phone) {
		// TODO Auto-generated method stub
		return mapper.updatePhoneByPhoneID(phone);
	}

	@Override
	public int updatePhonesByPhoneName(Phone phone) {
		// TODO Auto-generated method stub
		return mapper.updatePhonesByPhoneName(phone);
	}

	@Override
	public List<Phone> selectPhonesInRepository(String reposID) {
		// TODO Auto-generated method stub
		return mapper.selectPhonesInRepository(reposID);
	}
}
