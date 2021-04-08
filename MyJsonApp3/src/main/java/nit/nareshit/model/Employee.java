package nit.nareshit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private Integer eid;
	private String ename;
	private Float esal;
	
	private List<String> eprjs;
	private Set<String> modules;
	
	private Map<String,Integer> prjver;
	
	private Address addr;//HAS-A 
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Float getEsal() {
		return esal;
	}

	public void setEsal(Float esal) {
		this.esal = esal;
	}

	public List<String> getEprjs() {
		return eprjs;
	}

	public void setEprjs(List<String> eprjs) {
		this.eprjs = eprjs;
	}

	public Set<String> getModules() {
		return modules;
	}

	public void setModules(Set<String> modules) {
		this.modules = modules;
	}

	public Map<String, Integer> getPrjver() {
		return prjver;
	}

	public void setPrjver(Map<String, Integer> prjver) {
		this.prjver = prjver;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eprjs=" + eprjs + ", modules="
				+ modules + ", prjver=" + prjver + ", addr=" + addr + "]";
	}

	

	
	
	
}
