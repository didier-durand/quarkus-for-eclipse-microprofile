package net.didier.durand.quarkus.microprofile.test._native;


//source : https://quarkus.io/guides/building-native-image

import org.junit.jupiter.api.Disabled;

import io.quarkus.test.junit.NativeImageTest;
import net.durand.didier.quarkus.microprofile.test.HelloResourceTest;

@Disabled("to be fixed")
@NativeImageTest
public class HelloResourceNativeTest extends HelloResourceTest {

    // Execute the same tests but in native mode.
}