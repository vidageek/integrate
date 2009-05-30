package net.vidageek.integrate.structure;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import net.vidageek.fs.file.GenericFile;
import net.vidageek.integrate.DomainObject;

final public class PropertyFile extends GenericFile {

    public PropertyFile(final String configFile) {
        super(new java.io.File(configFile));
    }

    public PropertyFile addProperty(final PropertyKey key, final DomainObject object) {
        try {

            PrintWriter writer = new PrintWriter(toJavaFile());
            writer.append(key.asString() + "=" + object.asString());
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            throw new InfrastructureException("could not open file " + asString() + ".", e);
        }
        return this;
    }

    private String asString() {
        return getAbsolutePath();
    }

}
