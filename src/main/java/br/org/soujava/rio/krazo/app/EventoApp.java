package br.org.soujava.rio.krazo.app;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class EventoApp extends Application {

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> extensaoPadrai = new HashMap<>();
		extensaoPadrai.put("org.eclipse.krazo.defaultViewFileExtension", "jsp");
		return extensaoPadrai;
	}
}