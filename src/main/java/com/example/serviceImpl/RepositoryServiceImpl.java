package com.example.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.PhoneMapper;
import com.example.mapper.RepositoryMapper;
import com.example.pojo.Phone;
import com.example.pojo.Repository;
import com.example.service.RepositoryService;

@Service
public class RepositoryServiceImpl implements RepositoryService {

	@Autowired
	private RepositoryMapper mapperRepository;

	@Autowired
	private PhoneMapper mapperPhone;

	@Override
	public int insertRepository(Repository repository) {
		// TODO Auto-generated method stub
		return mapperRepository.insertRepository(repository);
	}

	@Override
	public int updateRepository(Repository repository) {
		// TODO Auto-generated method stub
		return mapperRepository.updateRepository(repository);
	}

	@Override
	public List<Repository> selectAllRepositories() {
		// TODO Auto-generated method stub
		return mapperRepository.selectAllRepositories();
	}

	@Override
	public Repository selectRepositoryByRepositoryID(String reposID) {
		// TODO Auto-generated method stub
		return mapperRepository.selectRepositoryByRepositoryID(reposID);
	}

	@Override
	public int deleteRepositoryByRepositoryID(String reposID) {
		// TODO Auto-generated method stub
		return mapperRepository.deleteRepositoryByRepositoryID(reposID);
	}

	

	/**
	 * 出售商品
	 */
	@Override
	public int handlePhoneSale(String phoneID, int saleCount) {
		Phone phone = mapperPhone.selectPhoneByPhoneID(phoneID);
		if (saleCount <= phone.getRemains()) {//判断售出是否小于库存剩余
			return mapperRepository.handlePhoneSale(phoneID, saleCount);
		}
		return 0;
	}

	/**
	 * 单件商品入库
	 */
	@Override
	public int handlerPhonePurchase(String phoneID, int purchaseCount) {
		return mapperRepository.handlerPhonePurchase(phoneID, purchaseCount);
	}


	

	

	

}
