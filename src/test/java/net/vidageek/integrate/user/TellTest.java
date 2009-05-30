package net.vidageek.integrate.user;

import junit.framework.Assert;
import net.vidageek.fs.Folder;
import net.vidageek.integrate.Name;
import net.vidageek.integrate.Password;
import net.vidageek.integrate.Project;
import net.vidageek.integrate.exception.IntegrateException;
import net.vidageek.integrate.scm.Repository;
import net.vidageek.integrate.scm.RepositoryURL;
import net.vidageek.integrate.scm.SCM;
import net.vidageek.integrate.scm.User;

import org.junit.Before;
import org.junit.Test;

final public class TellTest {

    private Project project;

    @Test
    public void testThatTellUserThatProjectExists() {
        try {
            new Tell().user().that(project).exists();
            Assert.fail();
        } catch (IntegrateException e) {
            Assert.assertEquals("project already exists", e.getMessage());
        }
    }

    @Before
    public void setup() {
        project = new Project(new Name("project"), new Repository(new SCM() {
            public void checkOut(final Folder projectFolder) {
            }

            public void update(final Folder projectFolder) {
            }

            public RepositoryURL repositoryURL() {
                return null;
            }
        }, new User(new Name(""), new Password(""))));

    }
}
