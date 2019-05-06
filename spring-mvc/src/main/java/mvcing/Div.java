package mvcing;

import org.springframework.stereotype.Service;

@Service("Div")
public class Div implements MathOp {
    @Override
    public int perform(int x, int y) {
        return x / y;
    }
}
