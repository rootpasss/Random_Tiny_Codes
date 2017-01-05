/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Javascript.
* Version: Javascript 1.7
* Development Environment: Sublime Text 3 [build 3126].
* Date: 05/01/17, Time: 09:14:26.
*
* Additional Info.
*
* Source Code Target Or Details:
*
*              []
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

var contentPane = document.querySelector( '.contentPane' )
var horizontal = document.querySelector( '.horizontal' )
var vertical = document.querySelector( '.vertical' )
var min = 1, max = 250
var box = document.querySelector( '.box' )
var info = document.querySelector( '.info' )
var option = document.querySelector( '.option' )
var widthFlag = Math.random() >= 0.5
var heightFlag = Math.random() >= 0.5

setContentPane()

horizontal.addEventListener( 'click', function() {
  updateBoxSize()
} )

vertical.addEventListener( 'click', function() {
  updateBoxSize()
} )

option.addEventListener( 'click', function() {
  if( option.checked ) {
    var timer = setInterval( function() {
      if( widthFlag ) {
        horizontal.value ++
      } else {
        horizontal.value --
      }

      if( horizontal.value == max ) {
        widthFlag = false
      }

      if( horizontal.value == min ) {
        widthFlag = true
      }

      if( ! option.checked ) {
        clearInterval( timer )
      }

      if( heightFlag ) {
        vertical.value ++
      } else {
        vertical.value --
      }

      if( vertical.value == min ) {
        heightFlag = false
      }

      if( vertical.value == max * -1 ) {
        heightFlag = true
      }

      updateBoxSize()
    }, 5 )
  }
} )

function setContentPane() {
  contentPane.style.top = window.innerHeight / 2 - contentPane.clientHeight / 2 + 'px'
  contentPane.style.left = window.innerWidth / 2 - contentPane.clientWidth / 2 + 'px'
  horizontal.value = 1 + Math.floor( Math.random() * max )
  vertical.value = 1 + Math.floor( Math.random() * max * -1 )
  updateBoxSize()
}

function updateBoxSize() {
  box.style.width = horizontal.value + 'px'
  box.style.height = vertical.value * -1 + 'px'
  box.style.top = contentPane.clientHeight / 2 - box.clientHeight / 2 + 'px'
  box.style.left = contentPane.clientWidth / 2 - box.clientWidth / 2 + 'px'
  info.innerHTML = 'Minedroid box size: ' + box.clientWidth + ' * ' + box.clientHeight
}
