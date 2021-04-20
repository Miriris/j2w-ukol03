package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */

//		musím sem dát komentář, protože nejde git
@Controller
public class VizitkaController {

  private final List<Vizitka> vizitky;

    public VizitkaController() {
      vizitky = Arrays.asList(
              new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", " ", "+420 800123456", "dita@czechitas.cs", "www.czechitas.cz"),
              new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", " ", "+420 800123456", null, "www.czechitas.cz"),
              new Vizitka("Monika Ptáčniková", "Czechitas z. s.", "Sokolovská 416/124", "18600 Praha 8", " ", "+420 800123456", "monika@czechitas.cs", "www.czechitas.cz" ),
              new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Žitná 561/8", "12000 Praha 2", " ", null, "mirka@czechitas.cs", "www.czechitas.cz")
      );
    }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", vizitky);
      return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", vizitky.get(id));
    return modelAndView;
  }
}
