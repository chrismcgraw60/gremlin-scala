package com.tinkerpop.gremlin.scala.sideeffect

import com.tinkerpop.blueprints.impls.tg.TinkerGraphFactory
import com.tinkerpop.gremlin.test.ComplianceTest
import com.tinkerpop.gremlin.scala._
import com.tinkerpop.pipes.Pipe
import com.tinkerpop.blueprints.{ Graph, Vertex }

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */

class StoreStepTest extends com.tinkerpop.gremlin.test.sideeffect.StoreStepTest {

  val g = TinkerGraphFactory.createTinkerGraph();

  def test_g_V_propertyXnameX_store_cap() {
    super.test_g_V_propertyXnameX_store_cap(g.V.property("name").store().cap.asInstanceOf[Pipe[Vertex, java.util.List[String]]]);
  }

  //  def test_g_V_storeXnameX_cap() {
  //    super.test_g_V_storeXnameX_cap(g.V.store { v: ScalaVertex ⇒ v.name }.cap.asInstanceOf[Pipe[Vertex, java.util.List[String]]]);
  //  }
}