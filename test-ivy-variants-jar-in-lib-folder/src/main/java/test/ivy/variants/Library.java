/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test.ivy.variants;

import com.github.jknack.handlebars.Handlebars;
import com.github.zafarkhaja.semver.Version;

public class Library {
    public static void main(String[] args) {
        Version v = Version.valueOf("1.0.0");
        System.out.println(v.toString());
        new Handlebars.SafeString("test");
    }
}
