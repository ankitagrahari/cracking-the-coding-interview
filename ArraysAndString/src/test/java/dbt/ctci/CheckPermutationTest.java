package dbt.ctci;

import dbt.ctci.helper.CustomAsserts;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

    CheckPermutation obj = new CheckPermutation();

    @Test
    void solution1() {
        CustomAsserts.dbtAssertTrue(obj.solution1("dog", "god"));
        CustomAsserts.dbtAssertFalse(obj.solution1("dog", "go  d"));
        CustomAsserts.dbtAssertFalse(obj.solution1("qwert", "tyeyee"));
        CustomAsserts.dbtAssertTrue(obj.solution1("aadaa", "daaaa"));
        CustomAsserts.dbtAssertFalse(obj.solution1("", ""));
    }

    @Test
    void solution2() {
        CustomAsserts.dbtAssertTrue(obj.solution2("dog", "god"));
        CustomAsserts.dbtAssertFalse(obj.solution2("dog", "go  d"));
        CustomAsserts.dbtAssertFalse(obj.solution2("qwert", "tyeyee"));
        CustomAsserts.dbtAssertTrue(obj.solution2("aadaa", "daaaa"));
        CustomAsserts.dbtAssertFalse(obj.solution2("", ""));
    }
}