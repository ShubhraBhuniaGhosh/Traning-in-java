package com.company.employeemanagement.storage;

import com.hsbc.employeepayroll.exception.InvalidStorageTypeException;

public class StorageFactory {
	public static Storage getStorage(int code) throws InvalidStorageTypeException {
		switch(code) {
		case 1: return new StorageImpl();
		case 2: return new StorageListImpl();
		case 3: return new StorageSortedImpl();
		case 4: return new StorageMapImpl();
		default: throw new InvalidStorageTypeException();
		}
	}

}
