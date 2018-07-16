package service;
import domain.*;
import java.util.List;

import domain.ProjectTeamBean;
import repository.ProjectTeamDAOImpl;

public class ProjectTeamServiceImpl implements ProjectTeamService{
	private static  ProjectTeamService instance = new  ProjectTeamServiceImpl();
	public static  ProjectTeamService getInstance() {
		return instance;
	}
	private  ProjectTeamServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void createProjectTeam(ProjectTeamBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> list() {
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
		return ProjectTeamDAOImpl.getInstance().selectOne(word);
	}

	@Override
	public int countService() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyProjectTeam(ProjectTeamBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectTeam(ProjectTeamBean member) {
		// TODO Auto-generated method stub
		
	}

}
