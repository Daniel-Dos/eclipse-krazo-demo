package br.org.soujava.rio.krazo.controler;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import br.org.soujava.rio.krazo.modelo.Evento;
import br.org.soujava.rio.krazo.repository.EventRepository;

@Controller
@Path("eventos")
public class EventoControler {

	@Inject
	private EventRepository eventRepositoty;

	@Inject
	private Models models;

	@POST
	@Path("addEvento")
	@View("redirect:eventos")
	public void adicionarEvento(@BeanParam Evento form) {
		this.eventRepositoty.save(form);
	}

	@GET
	@View("addEvento")
	@Path("form")
	public void getForm() {}

	@GET
	@View("eventos")
	public void getEventos() {
		this.models.put("eventos", this.eventRepositoty.findAll());
	}
}