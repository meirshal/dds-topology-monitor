var width = 800, height = 800;

var force = d3.layout.force()
        .charge(-200).linkDistance(30).size([width, height]);

var svg = d3.select("#graph").append("svg")
        .attr("width", "100%").attr("height", "100%")
        .attr("pointer-events", "all");

d3.json("http://localhost:8080/graph", function(error, graph) { //TODO: read the url from some kind of configuration variable

    if (error) {
        console.log("Error while fetching graph from server");
        return;
    }

    force.nodes(graph.nodes).links(graph.links).start();

    var link = svg.selectAll(".link")
            .data(graph.links).enter()
            .append("line").attr("class", "link");

    var node = svg.selectAll(".node")
            .data(graph.nodes).enter()
            .append("circle")
            .attr("class", function (d) { return "node "+d.label; })
            .attr("r", 10)
            .call(force.drag);

    // html title attribute
    node.append("id")
            .text(function (d) { return d.id; });

    // force feed algo ticks
    force.on("tick", function() {
        link.attr("x1", function(d) { return d.source.x; })
                .attr("y1", function(d) { return d.source.y; })
                .attr("x2", function(d) { return d.target.x; })
                .attr("y2", function(d) { return d.target.y; });

        node.attr("cx", function(d) { return d.x; })
                .attr("cy", function(d) { return d.y; });
    });
});
