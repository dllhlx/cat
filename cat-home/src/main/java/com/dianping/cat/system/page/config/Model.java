package com.dianping.cat.system.page.config;

import java.util.Collections;
import java.util.List;

import org.unidal.web.mvc.ViewModel;

import com.dianping.cat.consumer.core.dal.Project;
import com.dianping.cat.home.dal.report.AggregationRule;
import com.dianping.cat.system.SystemPage;

public class Model extends ViewModel<SystemPage, Action, Context> {

	private Project m_project;

	private List<Project> m_projects;

	private AggregationRule m_aggregationRule;

	private List<AggregationRule> m_aggregationRules;

	public AggregationRule getAggregationRule() {
   	return m_aggregationRule;
   }

	public void setAggregationRule(AggregationRule aggregationRule) {
   	m_aggregationRule = aggregationRule;
   }

	public List<AggregationRule> getAggregationRules() {
   	return m_aggregationRules;
   }

	public void setAggregationRules(List<AggregationRule> aggregationRules) {
   	m_aggregationRules = aggregationRules;
   }

	public Model(Context ctx) {
		super(ctx);
	}

	public String getDate() {
		return "";
	}

	@Override
	public Action getDefaultAction() {
		return Action.PROJECT_ALL;
	}

	public String getDomain() {
		return "";
	}

	public List<String> getDomains() {
		return Collections.emptyList();
	}

	public String getIpAddress() {
		return "";
	}

	public Project getProject() {
		return m_project;
	}

	public List<Project> getProjects() {
		return m_projects;
	}

	public void setProject(Project project) {
		m_project = project;
	}

	public void setProjects(List<Project> projects) {
		m_projects = projects;
	}
}
