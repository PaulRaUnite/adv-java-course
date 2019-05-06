package mvcing;

import org.springframework.stereotype.Service;

@Service("Mul")
public class Mul implements MathOp {
    @Override
    public int perform(int x, int y) {
        return x*y;
    }
}
