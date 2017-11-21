# dijkstra

POST  https://graph-dijkstra.herokuapp.com/dijkstra/findShortestPath 

{
  
  "graph": {
    "vertexes": [
      {
        "id": "Node_0",
        "name": "Node_0"
      },
      {
        "id": "Node_1",
        "name": "Node_1"
      },
      {
        "id": "Node_2",
        "name": "Node_2"
      },
      {
        "id": "Node_3",
        "name": "Node_3"
      },
      {
        "id": "Node_4",
        "name": "Node_4"
      },
      {
        "id": "Node_5",
        "name": "Node_5"
      },
      {
        "id": "Node_6",
        "name": "Node_6"
      },
      {
        "id": "Node_7",
        "name": "Node_7"
      },
      {
        "id": "Node_8",
        "name": "Node_8"
      },
      {
        "id": "Node_9",
        "name": "Node_9"
      },
      {
        "id": "Node_10",
        "name": "Node_10"
      }
    ],
    "edges": [
      {
        "id": "Edge_0",
        "source": {
          "id": "Node_0",
          "name": "Node_0"
        },
        "destination": {
          "id": "Node_1",
          "name": "Node_1"
        },
        "weight": 85
      },
      {
        "id": "Edge_1",
        "source": {
          "id": "Node_0",
          "name": "Node_0"
        },
        "destination": {
          "id": "Node_2",
          "name": "Node_2"
        },
        "weight": 217
      },
      {
        "id": "Edge_2",
        "source": {
          "id": "Node_0",
          "name": "Node_0"
        },
        "destination": {
          "id": "Node_4",
          "name": "Node_4"
        },
        "weight": 173
      },
      {
        "id": "Edge_3",
        "source": {
          "id": "Node_2",
          "name": "Node_2"
        },
        "destination": {
          "id": "Node_6",
          "name": "Node_6"
        },
        "weight": 186
      },
      {
        "id": "Edge_4",
        "source": {
          "id": "Node_2",
          "name": "Node_2"
        },
        "destination": {
          "id": "Node_7",
          "name": "Node_7"
        },
        "weight": 103
      },
      {
        "id": "Edge_5",
        "source": {
          "id": "Node_3",
          "name": "Node_3"
        },
        "destination": {
          "id": "Node_7",
          "name": "Node_7"
        },
        "weight": 183
      },
      {
        "id": "Edge_6",
        "source": {
          "id": "Node_5",
          "name": "Node_5"
        },
        "destination": {
          "id": "Node_8",
          "name": "Node_8"
        },
        "weight": 250
      },
      {
        "id": "Edge_7",
        "source": {
          "id": "Node_8",
          "name": "Node_8"
        },
        "destination": {
          "id": "Node_9",
          "name": "Node_9"
        },
        "weight": 84
      },
      {
        "id": "Edge_8",
        "source": {
          "id": "Node_7",
          "name": "Node_7"
        },
        "destination": {
          "id": "Node_9",
          "name": "Node_9"
        },
        "weight": 167
      },
      {
        "id": "Edge_9",
        "source": {
          "id": "Node_4",
          "name": "Node_4"
        },
        "destination": {
          "id": "Node_9",
          "name": "Node_9"
        },
        "weight": 502
      },
      {
        "id": "Edge_10",
        "source": {
          "id": "Node_9",
          "name": "Node_9"
        },
        "destination": {
          "id": "Node_10",
          "name": "Node_10"
        },
        "weight": 40
      },
      {
        "id": "Edge_11",
        "source": {
          "id": "Node_1",
          "name": "Node_1"
        },
        "destination": {
          "id": "Node_10",
          "name": "Node_10"
        },
        "weight": 600
      }
    ]
  },
  "origin": {
    "id": "Node_0",
    "name": "Node_0"
  },
  "destination": {
    "id": "Node_10",
    "name": "Node_10"
  }
}
