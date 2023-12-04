package org.Item1;

import java.lang.reflect.InvocationTargetException;

public abstract class Company {
    public static Company getInstance(String path) {
        Company company = null;
        try {
            Class<?> childCompany = Class.forName(path);
            company = (Company) childCompany.getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return company;
    }

    public abstract String getCompanyName();
}