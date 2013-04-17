require 'date'
require 'rake'
lib_path = File.expand_path('lib', File.dirname(__FILE__))
$:.unshift(lib_path) unless $:.include?(lib_path)
require 'chipmunk_android/version'
require 'chipmunk_android/description'

Gem::Specification.new do |s|
  s.name = %q{chipmunk_android}
  s.version = CP::VERSION
  s.date = Date.today.strftime '%Y-%m-%d'
  s.authors = ['Garoe Dorta']
  s.email = %q{neochuki@gmail.com}
  s.summary = %q{A chipmunk implementation for Android.}
  s.homepage = %q{https://github.com/neochuky/chipmunk_android/}
  s.description = CP::DESCRIPTION
  s.license = 'MIT'
  s.files = FileList['[A-Z]*', 'examples/{*,.*}', 'bin/*', 'lib/**/*', 'res/*/*'].to_a
end
