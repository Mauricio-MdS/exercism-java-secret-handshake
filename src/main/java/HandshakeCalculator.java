import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        var result = new ArrayList<Signal>();
        var reversedBinary = new StringBuilder(Integer.toBinaryString(number)).reverse().toString().toCharArray();

        for (int i = 0; i < Integer.min(4, reversedBinary.length); i++)
            if (reversedBinary[i] == '1') result.add(Signal.values()[i]);

        if (reversedBinary.length > 4 && reversedBinary[4] == '1') Collections.reverse(result);

        return result;
    }
}
