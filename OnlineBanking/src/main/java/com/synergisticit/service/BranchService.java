package com.synergisticit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.synergisticit.domain.Address;
import com.synergisticit.domain.Branch;

@Service
public interface BranchService {
	Branch createBranch(Branch toCreate);
	Branch getBranchById(long id);
	List<Branch> getAllBranches();
	Branch updateBranch(Branch updatedBranch);
	void deleteBranch(Branch toDelete);
	void deleteBranchById(Integer id);
}
