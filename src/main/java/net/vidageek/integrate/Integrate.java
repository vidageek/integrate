package net.vidageek.integrate;

import java.io.File;

import net.vidageek.integrate.scm.Repository;
import net.vidageek.integrate.scm.User;

final public class Integrate {
    public static void main(final String[] args) throws Exception {
        Project project = new Project(new Name(""), new Repository("",
                new User(new Name("nome"), new Password("senha"))));

        new ContinuousIntegrationManager(new File("rootDir")).add(project);
    }
}
