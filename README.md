# Android Dagger 2 Example
This example show how to implement Dagger 2 in MVP and MVVM pattern:
* Make activities/fragments auto inject field members by `@ContributesAndroidInjector` anotation and HasAndroidInjector interface
* Inject presenter/viewmodel by multibinding with map and factory
* Inject same type class with `@Qualifier`
* Provides base infomation of project with AppModule
* Use `@Singleton` to get same instance of a class within a component

