package mvcing;

import org.springframework.stereotype.Service;

@Service("Add")
public class Add implements MathOp {
    @Override
    public int perform(int x, int y) {
        return x + y;
    }
}
