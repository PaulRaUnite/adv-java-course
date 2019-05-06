package mvcing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller("www")
public class CalculatorController {
    private final Map<String, MathOp> operations;

    @Autowired
    public CalculatorController(Map<String, MathOp> operations) {
        this.operations = operations;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {

        System.out.println("index() is executed!");
        System.out.println("there are such operations:");
        for (String key : operations.keySet()) {
            System.out.println(key);
        }

        ModelAndView model = new ModelAndView();
        model.setViewName("index");

        model.addObject("operations", operations.keySet());

        return model;
    }

    @RequestMapping(value = "/{op}", params = {"x", "y"}, method = RequestMethod.GET)
    public ModelAndView perform(@PathVariable("op") String op, @RequestParam("x") int x, @RequestParam("y") int y) {
        System.out.println("perform(op) is executed - $op {}" + op);

        ModelAndView model = new ModelAndView();
        model.setViewName("perform");

        model.addObject("op", op);
        model.addObject("result", operations.get(op).perform(x, y));

        return model;
    }
}
