package service;
import java.util.List;
import domain.ProjectTeamBean;
public interface ProjectTeamService {
	public void createProjectTeam(ProjectTeamBean member);
	public List<ProjectTeamBean> list();
	public List<ProjectTeamBean> selectSome(String word);
	public ProjectTeamBean selectOne(String word);
	public int countService();
	public void modifyProjectTeam(ProjectTeamBean member);
	public void deleteProjectTeam(ProjectTeamBean member);
}
