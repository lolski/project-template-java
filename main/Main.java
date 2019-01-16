package grakn.template.java;

import com.google.common.collect.Lists;

public class Main {
    public static void main(String[] args) {
        DateUtil dateUtil = new DateUtil();
        Subpackage subpackage = new Subpackage();

        System.out.println("project-template-java");
        System.out.println("current time: " + dateUtil.getCurrentTime());
        System.out.println("subpackage.name(): " + subpackage.name());
        System.out.println("guava list(): " + Lists.newArrayList("a", "b", "c"));
    }
}