package org.rust.ide.inspections

class RsSimplifyBooleanExpressionInspectionTest : RsInspectionsTestBase(RsSimplifyBooleanExpressionInspection()) {
    fun `test subexpression`() = checkByText("""
            fn main() {
                let _ = <warning><warning>true && foo</warning> && bar</warning>;
            }
        """)
}
