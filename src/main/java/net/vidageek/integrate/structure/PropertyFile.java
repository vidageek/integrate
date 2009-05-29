package net.vidageek.integrate.structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import net.vidageek.integrate.DomainObject;

final public class PropertyFile {

    private final File propertyFile;

    public PropertyFile(final Folder folder, final String fileName) {
        propertyFile = folder.createFile(fileName);
    }

    public PropertyFile addProperty(final PropertyKey key, final DomainObject object) {
        try {

            PrintWriter writer = new PrintWriter(propertyFile);
            writer.append(key.asString() + "=" + object.asString());
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            throw new InfrastructureException("could not open file " + asString() + ".", e);
        }
        return this;
    }

    private String asString() {
        return propertyFile.getAbsolutePath();
    }

}
