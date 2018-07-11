package repository;

import java.util.List;
import domain.ProjectTeamBean;

public interface ProjectTeamDAO {
	public void insertProjectTeam(ProjectTeamBean ProjectTeam);
	public List<ProjectTeamBean> selectAll(ProjectTeamBean ProjectTeam);
	public List<ProjectTeamBean> selectSome(String word);
	public ProjectTeamBean selectOne(ProjectTeamBean ProjectTeam);
	public int countProjectTeam();
	public void updateProjectTeam(ProjectTeamBean ProjectTeam);
	public void delteProjectTeam(ProjectTeamBean ProjectTeam);
}
