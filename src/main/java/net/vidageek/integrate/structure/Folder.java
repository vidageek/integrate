package net.vidageek.integrate.structure;

import java.io.File;

import net.vidageek.integrate.Name;

final public class Folder {

    private final Folder parentFolder;
    private final File folder;

    public Folder(final Folder parentFolder, final Name newFolderName) {
        this.parentFolder = parentFolder;
        folder = parentFolder.createInnerFolder(newFolderName);
    }

    private File createInnerFolder(final Name name) {
        File file = new File(parentFolder.folder, name.asString());
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public boolean containsFolderNamed(final String folderName) {
        return new File(folder, folderName).exists();
    }

    protected File createFile(final String fileName) {
        return new File(folder, fileName);
    }

}
