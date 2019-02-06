package com.pirate.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.pirate.bean.Employee;

public class Repository implements RepositoryImpl {

	Map<Integer, Employee> map = new HashMap<>();
	
	/* (non-Javadoc)
	 * @see com.pirate.repo.RepositoryImpl#save(com.pirate.bean.Employee)
	 */
	@Override
	public boolean save(Employee emp) {
		if(map.containsKey(emp.getEmpId())){
			return false;
		}
		map.put(emp.getEmpId(), emp);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.pirate.repo.RepositoryImpl#searchByName(java.lang.String)
	 */
	@Override
	public List<Employee> searchByName(String name) {
		List<Employee> list = new ArrayList<>();
		for(Entry<Integer, Employee> entry : map.entrySet()) {
			if(entry.getValue().getEmpName() == name) {
				list.add(entry.getValue());
				return list;
			}
		}
		return null;
	}

}
