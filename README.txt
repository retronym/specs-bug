[info] == test-compile ==
[info]
[info] == test-start ==
[info] == test-start ==
[info]
[info] == BrokenTest ==
[error] Could not create an instance of BrokenTest
[error]   null
[error]   sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
[error]   sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)
[error]   sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
[error]   java.lang.reflect.Constructor.newInstance(Constructor.java:513)
[error]   org.specs.util.Classes$class.createInstanceFor(Classes.scala:78)
[error]   org.specs.util.Classes$.createInstanceFor(Classes.scala:27)
[error]   org.specs.util.Classes$class.create(Classes.scala:38)
[error]   org.specs.util.Classes$.create(Classes.scala:27)
[error]   org.specs.runner.TestInterfaceRunner.run(TestInterfaceRunner.scala:55)
[error]   sbt.TestRunner.run(TestFramework.scala:53)
[error]   sbt.TestRunner.runTest$1(TestFramework.scala:67)
[error]   sbt.TestRunner.run(TestFramework.scala:76)
[error]   sbt.TestFramework$$anonfun$10$$anonfun$apply$11.runTest$2(TestFramework.scala:194)
[error]   sbt.TestFramework$$anonfun$10$$anonfun$apply$11$$anonfun$apply$12.apply(TestFramework.scala:205)
[error]   sbt.TestFramework$$anonfun$10$$anonfun$apply$11$$anonfun$apply$12.apply(TestFramework.scala:205)
[error]   sbt.NamedTestTask.run(TestFramework.scala:92)
[error]   sbt.ScalaProject$$anonfun$sbt$ScalaProject$$toTask$1.apply(ScalaProject.scala:193)
[error]   sbt.ScalaProject$$anonfun$sbt$ScalaProject$$toTask$1.apply(ScalaProject.scala:193)
[error]   sbt.TaskManager$Task.invoke(TaskManager.scala:62)
[error]   sbt.impl.RunTask.doRun$1(RunTask.scala:77)
[error]   sbt.impl.RunTask.runTask(RunTask.scala:85)
[error]   sbt.impl.RunTask.sbt$impl$RunTask$$runIfNotRoot(RunTask.scala:60)
[error]   sbt.impl.RunTask$$anonfun$runTasksExceptRoot$2.apply(RunTask.scala:48)
[error]   sbt.impl.RunTask$$anonfun$runTasksExceptRoot$2.apply(RunTask.scala:48)
[error]   sbt.Distributor$Run$Worker$$anonfun$2.apply(ParallelRunner.scala:131)
[error]   sbt.Distributor$Run$Worker$$anonfun$2.apply(ParallelRunner.scala:131)
[error]   sbt.Control$.trapUnit(Control.scala:19)
[error]   sbt.Distributor$Run$Worker.run(ParallelRunner.scala:131)
[error]   scala.Predef$.error(Predef.scala:58)
[error]   org.specs.Specification.error(Specification.scala:66)
[error]   BrokenTest.<init>(BrokenTest.scala:4)
[error]   sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
[error]   sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)
[error]   sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
[error]   java.lang.reflect.Constructor.newInstance(Constructor.java:513)
[error]   org.specs.util.Classes$class.createInstanceFor(Classes.scala:78)
[error]   org.specs.util.Classes$.createInstanceFor(Classes.scala:27)
[error]   org.specs.util.Classes$class.create(Classes.scala:38)
[error]   org.specs.util.Classes$.create(Classes.scala:27)
[error]   org.specs.runner.TestInterfaceRunner.run(TestInterfaceRunner.scala:55)
[error]   sbt.TestRunner.run(TestFramework.scala:53)
[error]   sbt.TestRunner.runTest$1(TestFramework.scala:67)
[error]   sbt.TestRunner.run(TestFramework.scala:76)
[error]   sbt.TestFramework$$anonfun$10$$anonfun$apply$11.runTest$2(TestFramework.scala:194)
[error]   sbt.TestFramework$$anonfun$10$$anonfun$apply$11$$anonfun$apply$12.apply(TestFramework.scala:205)
[error]   sbt.TestFramework$$anonfun$10$$anonfun$apply$11$$anonfun$apply$12.apply(TestFramework.scala:205)
[error]   sbt.NamedTestTask.run(TestFramework.scala:92)
[error]   sbt.ScalaProject$$anonfun$sbt$ScalaProject$$toTask$1.apply(ScalaProject.scala:193)
[error]   sbt.ScalaProject$$anonfun$sbt$ScalaProject$$toTask$1.apply(ScalaProject.scala:193)
[error]   sbt.TaskManager$Task.invoke(TaskManager.scala:62)
[error]   sbt.impl.RunTask.doRun$1(RunTask.scala:77)
[error]   sbt.impl.RunTask.runTask(RunTask.scala:85)
[error]   sbt.impl.RunTask.sbt$impl$RunTask$$runIfNotRoot(RunTask.scala:60)
[error]   sbt.impl.RunTask$$anonfun$runTasksExceptRoot$2.apply(RunTask.scala:48)
[error]   sbt.impl.RunTask$$anonfun$runTasksExceptRoot$2.apply(RunTask.scala:48)
[error]   sbt.Distributor$Run$Worker$$anonfun$2.apply(ParallelRunner.scala:131)
[error]   sbt.Distributor$Run$Worker$$anonfun$2.apply(ParallelRunner.scala:131)
[error]   sbt.Control$.trapUnit(Control.scala:19)
[error]   sbt.Distributor$Run$Worker.run(ParallelRunner.scala:131)
[info] == BrokenTest ==
[info]
[info] == Test cleanup 1 ==
[info] Deleting directory /var/folders/vQ/vQZfxx8pGp8OZLoN+ZWxTk+++TI/-Tmp-/sbt_8a098fd7
[info] == Test cleanup 1 ==
[info]
[info] == test-finish ==
[error] Error: Total 1, Failed 0, Errors 1, Passed 0, Skipped 0
[info] == test-finish ==
[info]
[info] == test-cleanup ==
[info] == test-cleanup ==
[error] Error running BrokenTest: ERROR occurred during testing.
[error] Error running test: One or more subtasks failed
[info]
[info] Total time: 8 s, completed Nov 27, 2010 12:31:19 AM
