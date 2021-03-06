package gov.hhs.onc.sdcct.xml.jaxb.metadata.impl;

import com.sun.msv.grammar.ReferenceExp;
import gov.hhs.onc.sdcct.xml.jaxb.metadata.JaxbContextMetadata;
import gov.hhs.onc.sdcct.xml.jaxb.metadata.JaxbSchemaMetadata;
import gov.hhs.onc.sdcct.xml.jaxb.metadata.JaxbSchemaMetadataComponent;
import javax.xml.namespace.QName;

public abstract class AbstractJaxbSchemaMetadataComponent<T extends ReferenceExp> extends AbstractJaxbContextMetadataComponent<T>
    implements JaxbSchemaMetadataComponent<T> {
    protected JaxbSchemaMetadata schema;
    protected QName qname;
    protected boolean abztract;

    protected AbstractJaxbSchemaMetadataComponent(JaxbContextMetadata context, JaxbSchemaMetadata schema, T expr, String name, QName qname, boolean abztract) {
        super(context, expr, name);

        this.schema = schema;
        this.qname = qname;
        this.abztract = abztract;
    }

    @Override
    public boolean isAbstract() {
        return this.abztract;
    }

    @Override
    public QName getQname() {
        return this.qname;
    }

    @Override
    public JaxbSchemaMetadata getSchema() {
        return this.schema;
    }
}
