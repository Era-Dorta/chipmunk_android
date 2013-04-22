Chipmunk_Android
================
A [Chipmunk](https://chipmunk-physics.net/) implementation for ruby in Adroid devices.

Installation
-----------

Install [ruboto](https://github.com/ruboto/ruboto/) and create a project. 

With this installation method you will have a clean enviroment (bundler) to make your gosu games.

* Create a file named `Gemfile.apk` in your ruboto project and add the lines:

```ruby
source "http://rubygems.org"
gem 'chipmunk_android'
```

Check gosu_android [this](https://github.com/neochuky/gosu-android/blob/trunk/examples/arkanoid_activity.rb) example to see how it works.

Implemented code
-------------------
* Shapes:
    * Segment
        * Only constructor, no collision methods.     
    * Circle
        * Only constructor, no collision methods.
    * Poly
        * Constructor, only for squares.
        * Collision method with segments.
* Body
    * Constructor
    * Position changes if velocity is set.
* Space
    * Add/remove bodies/shapes.
    * add_collision_func with/without arguments.
    * step method.
* Vec2
    * Constructor
    * Access methods, since it is in hava use v.set(i) instead of v[i] for array access.
