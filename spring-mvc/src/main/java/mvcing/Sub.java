package mvcing;

import org.springframework.stereotype.Service;

@Service("Sub")
public class Sub implements MathOp {
    @Override
    public int perform(int x, int y) {
        return x-y;
    }
}
