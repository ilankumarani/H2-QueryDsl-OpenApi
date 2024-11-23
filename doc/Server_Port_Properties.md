#### 1.1 Fixed Port

```yaml
server.port: 8085
```

#### 1.2 Random/Dynamic Port

```yaml
server.port: 0
```

#### 1.3 Random port in a custom predefined range

```yaml
server.port: ${random.int(8080,9090)}
```