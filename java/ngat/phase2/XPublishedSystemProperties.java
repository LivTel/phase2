package ngat.phase2;

import java.util.List;
import java.util.Map;

public class XPublishedSystemProperties implements IPublishedSystemProperties {

	//unfortunately, I haven't figured out how to implement maps in JiBX, consequently, this class uses two lists to deliver the implementation
	/*
	See 
	http://jibx.sourceforge.net/extras.html
	for how maps are implemented
	 */
	
	private List keysList;
	private List valuesList;
	
	public XPublishedSystemProperties() {
	}
	
	public synchronized String getValue(String key) {
		
		if (keysList.size() == 0) {
			return null; //return null if length of keys list is 0
		}
		
		if (!keysList.contains(key)) {
			return null; //return null if key doesn't exist in keys list
		}
		
		for (int keysListIndex = 0; keysListIndex < keysList.size(); keysListIndex ++) {
			String keyFound = (String) keysList.get(keysListIndex);
			if (keyFound.equalsIgnoreCase(key)) {
				//key found at index == keysListIndex, therefore return value at keysListIndex
				return (String) valuesList.get(keysListIndex);
			}
		}
		//value not found
		return null;
	}

	/**
	 * given a value, store it against the key given
	 * if the key exists already, it will fail
	 * doesn't replace a value that is already stored against a key
	 */
	public synchronized boolean setValue(String key, String value) {

		if (keysList.contains(key)) {
			return false; //return false if key already exists in the keys list
		}
		
		keysList.add(key);
		valuesList.add(value);
		
		return true;
	}
	
	/**
	 * The following methods are required to be implemented for the JiBX compiler
	 */
	public List getKeysList() {
		return keysList;
	}
	
	public void setKeysList(List list) {
		this.keysList = list;
	}
	
	public List getValuesList() {
		return valuesList;
	}
	
	public void setValuesList(List list) {
		this.valuesList = list;
	}
	
}
