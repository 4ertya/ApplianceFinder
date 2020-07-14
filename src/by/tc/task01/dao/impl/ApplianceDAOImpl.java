package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Command;
import by.tc.task01.dao.CommandProvider;
import by.tc.task01.dao.ParseTxt;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	private ParseTxt parseTxt= new ParseTxt();

	@Override
	public List<Appliance> find(Criteria criteria) {
		List<Appliance> appliances = new ArrayList<>();
		CommandProvider commandProvider = new CommandProvider();
		Command currentCommand = commandProvider.takeCommand(criteria.getGroupSearchName());
		List<String> lines = parseTxt.findLines(criteria);


		for (String line: lines){
			String tempLine = line.substring(line.indexOf(":")+1,line.indexOf(";"));
			String[] pairs = tempLine.split(",");
			Map<String,String> values = new HashMap<>();
			for (String pair:pairs){
				pair=pair.trim();
				String [] temp=pair.split("=");
				values.put(temp[0],temp[1]);
			}
			appliances.add(currentCommand.execute(values));
		}

		return appliances;
	}
	
	// you may add your own code here

}


//you may add your own new classes