package com.synergisticit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synergisticit.domain.Account;
import com.synergisticit.domain.Address;
import com.synergisticit.domain.Branch;
import com.synergisticit.service.BranchService;


@Controller
public class BranchController {
	@Autowired BranchService branchService;
	
	@RequestMapping("/branchForm")
	public String branchForm(Branch branch, Model model) {
		List<Branch> branches = branchService.getAllBranches();
		model.addAttribute("branches", branches);
		return "branchForm";
	}
	
	@RequestMapping("/branchTable")
	public String branchTable(Branch branch, Model model) {
		List<Branch> branches = branchService.getAllBranches();
		model.addAttribute("branches", branches);
		return "branchTable";
	}
	
	@RequestMapping("/createBranch")
	public String createBranch(@ModelAttribute Branch branch, Model model) {
		branchService.createBranch(branch);
		model.addAttribute("branch", branch);
		List<Branch> branches = branchService.getAllBranches();
		model.addAttribute("branches", branches);
		return "redirect:branchForm";
	}
	
	@RequestMapping("/getBranchById/{id}")
	public String getBranchById(@PathVariable String id, Model model) {
		model.addAttribute("branch", branchService.getBranchById(Long.valueOf(id)));
		model.addAttribute("branches", branchService.getAllBranches());
		return "branchForm";
	}
	
	@RequestMapping("/getAllBranches")
	public String getAllBranches(Model model){
		model.addAttribute("branch", new Branch());
		model.addAttribute("branches", branchService.getAllBranches());
		return "branchForm";
	}
	
	@RequestMapping("/updateBranch")
	public String updateBranch(@RequestBody Branch branch, Model model) {
		model.addAttribute("branch", branchService.updateBranch(branch));
		model.addAttribute("branches", branchService.getAllBranches());
		return "branchForm";
	}
	
	@RequestMapping("/deleteBranchById/{id}")
	public String deleteBranchById(@PathVariable int id, Model model) {
		branchService.deleteBranchById(id);
		model.addAttribute("branch", new Branch());
		model.addAttribute("branches", branchService.getAllBranches());
		return "redirect:branchTable";
	}
	
	@RequestMapping("/deleteBranch")
	public String deleteBranch(@RequestBody Branch branch, Model model) {
		branchService.deleteBranch(branch);
		model.addAttribute("branch", new Branch());
		model.addAttribute("branches", branchService.getAllBranches());
		return "branchForm";
	}
}
