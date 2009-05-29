package net.vidageek.integrate;

import net.vidageek.integrate.structure.Folder;
import net.vidageek.integrate.user.Tell;

final public class ContinuousIntegrationManager {

    private final Folder rootFolder;

    public ContinuousIntegrationManager(final Folder folder) {
        rootFolder = folder;
    }

    public void add(final Project project) {

        if (project.existsOn(rootFolder)) {
            new Tell().user().that(project).exists();
        }

        Folder projectFolder = project.createFolderStructure(rootFolder);

        project.repository().checkOut(projectFolder);
    }
}
