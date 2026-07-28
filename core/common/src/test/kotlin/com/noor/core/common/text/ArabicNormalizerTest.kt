package com.noor.core.common.text

import org.junit.Assert.assertEquals
import org.junit.Test

class ArabicNormalizerTest {
    @Test
    fun removesMarksAndNormalizesArabicVariants() {
        assertEquals("بسم الله الرحمن الرحيم", ArabicNormalizer.normalize("بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ"))
        assertEquals("ايه", ArabicNormalizer.normalize("آيَة"))
    }

    @Test
    fun buildsSafePrefixQuery() {
        assertEquals("الرحمن* الرحيم*", ArabicNormalizer.toFtsPrefixQuery("الرَّحمن الرحيم"))
        assertEquals("and*", ArabicNormalizer.toFtsPrefixQuery("AND"))
    }
    @Test
    fun boundsFtsQueryComplexity() {
        val longQuery = (1..30).joinToString(" ") { "كلمةطويلةجداً" }
        val terms = ArabicNormalizer.toFtsPrefixQuery(longQuery).split(' ')

        assertEquals(ArabicNormalizer.MAX_QUERY_TOKENS, terms.size)
    }

}
