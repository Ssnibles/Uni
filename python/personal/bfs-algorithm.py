import collections


# BFS algorithm
def bfs(graph, root):
    visited, queue = set(), collections.deque([root])
    visited.add(root)

    while queue:
        vertex = queue.popleft()
        print(str(vertex) + " ", end="")

        for neighbour in graph[vertex]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)


if __name__ == "__main__":
    # Expanded graph with more nodes and connections
    graph = {
        0: [1, 2, 4],
        1: [2, 5],
        2: [3, 6],
        3: [1, 2, 7],
        4: [0, 5],
        5: [1, 4, 8],
        6: [2, 7],
        7: [3, 6, 8],
        8: [5, 7],
    }
    print("Following is Breadth First Traversal: ")
    bfs(graph, 0)
