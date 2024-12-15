package com.synergisticit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.Branch;
import com.synergisticit.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService{
	@Autowired BranchRepository branchRepo;
	
	@Override
	public Branch createBranch(Branch toCreate) {
		// TODO Auto-generated method stub
		return branchRepo.save(toCreate);
	}

	@Override
	public Branch getBranchById(long id) {
		// TODO Auto-generated method stub
		Optional<Branch> optBranch = branchRepo.findById(id);
		if(optBranch.isPresent()) {
			return optBranch.get();
		}
		return null;
	}

	@Override
	public List<Branch> getAllBranches() {
		// TODO Auto-generated method stub
		return branchRepo.findAll();
	}

	@Override
	public Branch updateBranch(Branch updatedBranch) {
		// TODO Auto-generated method stub
		return branchRepo.save(updatedBranch);
	}

	@Override
	public void deleteBranch(Branch toDelete) {
		// TODO Auto-generated method stub
		branchRepo.delete(toDelete);
	}

	@Override
	public void deleteBranchById(Integer id) {
		// TODO Auto-generated method stub
		branchRepo.deleteById(id.longValue());
	}

}
