package bpp.domain;

import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;

public class BpelNamespaceContext implements NamespaceContext {

    public static final String BPEL_NAMESPACE = "http://docs.oasis-open.org/wsbpel/2.0/process/executable";

	@Override
	public String getNamespaceURI(String prefix) {
		if ("bpel".equals(prefix)) {
			return BPEL_NAMESPACE;
		}

		return null;
	}

	@Override
	public String getPrefix(String namespaceURI) {
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator getPrefixes(String namespaceURI) {
		return null;
	}

}
