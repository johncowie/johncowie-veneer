// alert('Hello');

/* var svg = d3.select('.topbar')
            .append('svg')
            .attr({width: 800, height: 30}); */


var sinlineFunction = d3.svg.line()
                     .x(function(d){ return d })
                     .y(function(d) {return Math.sin(d/10)*15 + 15})
                     .interpolate('linear');
var coslineFunction = d3.svg.line()
                     .x(function(d){ return d })
                     .y(function(d) {return Math.cos(d/10)*15 + 15})
                     .interpolate('linear');

/* svg.append('path').attr('d', sinlineFunction(_.range(500)))
                  .attr("stroke", "grey")
                  .attr("stroke-width", 2)
                  .attr("fill", "none")
                  .transition()
                  .duration(2)
                  .attr('d', coslineFunction(_.range(500))); */


