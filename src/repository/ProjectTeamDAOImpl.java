package repository;

import java.sql.*;
import java.util.List;

import domain.ProjectTeamBean;
import enums.MemberQuery;
import enums.Vendor;
import factory.DatabaseFactory;
import pool.DBConstant;
import service.ProjectTeamService;
import service.ProjectTeamServiceImpl;
import sun.security.pkcs11.Secmod.DbMode;

public class ProjectTeamDAOImpl implements ProjectTeamDAO{
	private static  ProjectTeamDAO instance = new  ProjectTeamDAOImpl();
	public static  ProjectTeamDAO getInstance() {
		return instance;
	}
	private  ProjectTeamDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertProjectTeam(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> selectAll(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectTeamBean selectOne(String word) {
		ProjectTeamBean team = null;
		return team;
	}

	@Override
	public int countProjectTeam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateProjectTeam(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteProjectTeam(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		
	}

}
