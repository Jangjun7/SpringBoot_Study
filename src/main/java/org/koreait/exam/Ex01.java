package org.koreait.exam;

import org.koreait.constants.Role;

public class Ex01 {
    public static void main(String[] args) {
        Role role = Role.ADMIN;
        Role role2 = Role.USER;

        System.out.printf("ordinal : %d, name : %s%n", role.ordinal(), role.name());
        System.out.printf("ordinal : %d, name : %s%n", role2.ordinal(), role2.name());
    }
}
